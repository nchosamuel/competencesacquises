from random import*
def melange() :
    paquet=[1,2,3,4,5,6,7,8,9,10]
    k = 0
    while k < 49:
        i=randint(0,9)
        j=randint(0,9)
        temp=paquet[i]
        paquet[i]=paquet[j]
        paquet[j]=temp
        k=k+1
    return paquet

paquet= melange()
paquetA=[]
paquetB=[]
for i in range(10):
    if i%2 == 0:
        paquetA=paquetA+[paquet[i]]
    else:
        paquetB.append(paquet[i]) #meme chose plus simple

scoreA=0
scoreB=0
for i in range(5):
    print("Joueur A:",paquetA[i]," Joueur B:",paquetB[i])
    if paquetA[i]>paquetB[i]:
        scoreA=scoreA+1
    else:
        scoreB=scoreB+1
print("A:",scoreA," B:",scoreB)
