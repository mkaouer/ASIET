package projetgraph2006;


import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

/**
 *
 * <p>Titre : CustomizedJTable</p>
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2006</p>
 * <p>Société : </p>
 * @author Reda
 * @version 1.0
 */

public class Tableur
    extends JTable {

  private static ArrayList names = null;
  private static ArrayList data = null;
  private static TableModel model = null;

  private boolean editable = false;

  private void refreshModel() {
    model = new AbstractTableModel() {
      public int getColumnCount() {  return names.size();   }

      public int getRowCount() {        return data.size();      }

      public Object getValueAt(int row, int col) {        Object value;
        try {
          value = ( (Object[]) data.get(row))[col];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
          value = "";
        }
        return value;
      }

      public String getColumnName(int column) {
        return (String) names.get(column);
      }

      public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
      }

      public boolean isCellEditable(int row, int col) {
        return editable;
      }

      public void setValueAt(Object aValue, int row, int column) {
        try {
          ( (Object[]) data.get(row))[column] = aValue;
        }
        catch (ArrayIndexOutOfBoundsException ex) {

        }
      }
    };
    setModel(model);
  }

  public Tableur() {
    super();
    names = new ArrayList();
    data = new ArrayList();
    refreshModel();
  }

  public void setEditable(boolean editable) {
    this.editable = editable;
    refreshModel();
  }

  public ArrayList getRows() { return data;  }

  public void clear() {
    data = new ArrayList();
    refreshModel();
  }

  public void addRow(Object[] dataRow) {
    data.add(dataRow);
    refreshModel();
  }

  public void addRow(int row, Object[] dataRow) {
    data.add(row, dataRow);
    refreshModel();
  }

  public void removeRow(Object[] dataRow) {
    data.remove(dataRow);
    refreshModel();
  }

  public void removeRow(int index) {
    data.remove(index);
    refreshModel();
  }

  public void setRow(int row, Object[] dataRow) {
    data.set(row, dataRow);
    refreshModel();
  }

  public void addColumn(String column) {
    names.add(column);
    refreshModel();
  }

  public void addColumn(int row, String column) {
    names.add(row, column);
    refreshModel();
  }

  public void setColumn(int row, String column) {
    names.set(row, column);
    refreshModel();
  }

  public ArrayList getColumnsNames() {
    return names;
  }

  public void setColumnsNames(ArrayList names) {
    this.names = names;
    refreshModel();
  }
}
