def exo6():
    nb= int(input("entrez un nombre entier naturel"))
    for i in range(1,nb+1) :
        if nb%i==0:
            print(i, end=" ")
def exo7():
    a=int(input("entrez un premier nombre"))
    b=int(input("entrez un second nombre"))
    r=1
    while r>0 :
        q=a//b
        r=a%b
        if r==0:
            ("le PGCD est", b)
        else:
            a=b
            b=r

def romain(nb):
    nb_romain=""
    for i in[100,500,100,50,10,5,1]:
        quot=nb//i

        if quot>0:
            if i==1000:
                for j in range(quot):
                    nb_romain+="M"
                nb=nb%i
            elif i==500:
                if nb>=900:
                    nb_romain+="CM"
                    nb-=900
                else :
                    nb_romain+="D"
                    nb=nb%i
            elif i==100 :
                if nb>=400:
                    nb_romain+="CD"
                    nb-=400
                else:
                    for h in range(quot):
                        nb_romain+="C"
                        nb=nb%i
            elif i==50:
                if nb>=90 :
                    nb_romain+="XC"
                    nb-=90
                else:
                    nb_romain+="L"
                    nb=nb%i
            elif i==10:
                if nb>=40:
                    nb_romain+="XL"
                    nb-=40
                else :
                    nb_romain+="X"
                    nb=nb%i
            elif i==5 :
                if nb==9:
                    nb_romain+="IX"
                    nb-=9
                else :
                    nb_romain+="V"
                    nb=nb%i
            elif i==1 :
                if nb==4:
                    nb_romain+="IV"
                else :
                    for k in range(quot) :
                        nb_romain+="I"
    print(nb_romain)

def occure(texte,lettre):
    nb=0
    long=len(texte)
    for i in range(long):
        if texte[i] == lettre:
            nb+=1
    return nb
romain(10)


