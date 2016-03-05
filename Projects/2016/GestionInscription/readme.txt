Gestion d'inscription---------------------
Url     : http://codes-sources.commentcamarche.net/source/49162-gestion-d-inscriptionAuteur  : cs_youma85Date    : 01/08/2013
Licence :
=========

Ce document intitulé « Gestion d'inscription » issu de CommentCaMarche
(codes-sources.commentcamarche.net) est mis à disposition sous les termes de
la licence Creative Commons. Vous pouvez copier, modifier des copies de cette
source, dans les conditions fixées par la licence, tant que cette note
apparaît clairement.

Description :
=============

Une application en java qui permet de faire une gestion d'inscription des &eacut
e;tudiants dans un cours. 
<br />L'affichage se fait par une JTable.
<br />Pou
r ajouter, inscrire ou d&eacute;sinscrire  il faut s'authentifier.
<br /><a nam
e='source-exemple'></a><h2> Source / Exemple : </h2>
<br /><pre class='code' d
ata-mode='basic'>
Exemple d'ajout de l'étudiant
int id=0; 
if(txtId.getText()
.isEmpty())
    JOptionPane.showMessageDialog(null, &quot;Veuillez remplir le c
hamp Id&quot;);
else
    if(txtNom.getText().isEmpty())
	JOptionPane.showMess
ageDialog(null, &quot;Veuillez remplir le champ Nom&quot;);
    else
        i
f(txtPrenom.getText().isEmpty())
             JOptionPane.showMessageDialog(nul
l, &quot;Veuillez remplir le champ Prénom&quot;);
        else
           if(t
xtDate.getText().isEmpty())
		JOptionPane.showMessageDialog(null, &quot;Veuille
z remplir le champ Date&quot;);
           else	
	     if(txtAdresse.getText()
.isEmpty())
		JOptionPane.showMessageDialog(null, &quot;Veuillez remplir le cha
mp Adresse&quot;);
	     else
		if(txtTel.getText().isEmpty())
         	    
 JOptionPane.showMessageDialog(null, &quot;Veuillez remplir le champ Téléphone&q
uot;);
                else
                {
											try
											{	

												boolean trouve=false;
												id= Integer.parseInt(txtId.getTex
t());
												for(Etudiant etud:MenuF.getEnsEtudiant())
													if(et
ud.getId()==id)
														trouve=true;
												
												if(trouve
==false)
												{
													try
													{
														MenuF.g
etEnsEtudiant().add(new Etudiant(id,txtNom.getText(),
														txtPrenom.g
etText(),txtDate.getText(),txtAdresse.getText(),
														txtTel.getText()
));
														JOptionPane.showMessageDialog(null, &quot;étudiant Ajouté&quo
t;);
														//effacer les champs
														txtId.setText(&quot;&quo
t;);
														txtNom.setText(&quot;&quot;);
														txtPrenom.setTe
xt(&quot;&quot;);
														txtDate.setText(&quot;&quot;);
														t
xtAdresse.setText(&quot;&quot;);
														txtTel.setText(&quot;&quot;);
	
												}catch(ErreurDate erD)
													{
														JOptionPane.sh
owMessageDialog(null, erD.getMessage());
													} catch (ErreurTelephone 
erT) {
														JOptionPane.showMessageDialog(null, erT.getMessage());
		
											}
												}
												else
													JOptionPane.showMess
ageDialog(null, &quot;Un étudiant existe déjà avec le même identifiant&quot;);

											}catch(NumberFormatException err)
											{
												JOptionP
ane.showMessageDialog(null, &quot;Veuillez mettre un entier dans le champ id&quo
t;);
											}
										}
</pre>
