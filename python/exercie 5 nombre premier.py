#exercie 5 nombre premier
def premier(nb):
    rep=True
    for i in range(2,nb):
        if nb%i==0:
            rep=False
    return rep

#test
N=int(input("entrez un nombre superieur a 2: "))
print("les nombre premier inferieur a",N,"sont:")
for i in range (2,N):
    if premier(i):
        print(i,end=" ")

