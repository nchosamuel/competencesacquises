#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      street'zer
#
# Created:     20/11/2019
# Copyright:   (c) street'zer 2019
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#exercice3
nb = int(input("entrez un nombre entier"))
for i in range(11):
    print(i,"x",nb,"=",i*nb)
#exercice4
N=int(input("entrez un nombre entier"))
etoile = ""
for i in range(N):
    etoile = etoile +"*"
    print(etoile)
#exercice5
texte=input("entrez une phrase ou un mot:")
lettre=input("entrez,à present, un caractère")
compteur=0
for i in range(len(texte)):
    if lettre == texte[i]:
        compteur=compteur + 1
print("le texte", texte,"contient",compteur,lettre)
#exercice7








