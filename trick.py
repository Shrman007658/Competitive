def g(m,n):
    res=0
    while (m>=n):
        (res,m)=(res+1,m/n)
    return(res)
for i in range(2,10):
    j=g(637,i)
    if(j==4):
        print(i)
        print("\n")
