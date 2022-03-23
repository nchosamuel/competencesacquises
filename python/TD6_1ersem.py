def exo2():
    tabval=[]
    positif=[]
    negatif=[]
    taille=int(input("donnez le nombre de valeurs a entrer"))
    for i in range(taille):
        val=int(input("Entrez une valeur"))
        tabval=tabval+[val]
    print(tabval)
    for i in range(taille):
        if tabval[i]>0:
            positif=positif+[tabval[i]]
        else:
            negatif=negatif+[tabval[i]]
        print(positif)
        print(negatif)

def exo3():
    tabval=[]
    taille=int(input("donnez le nombre de valeurs a entrer"))
    for i in range(taille):
        val=int(input("Entrez une valeur"))
        tabval=tabval+[val]
    print(tabval)
    max=tabval[0]
    indice=1
    for i in range(1,taille):
        if tabval[i]>max:
            max=tabval[i]
        indice=indice+1
    print("la plus grande valeur est " + max +" qui est en " + indice + "ème position")


exo3()




