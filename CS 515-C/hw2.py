# Namra Sanjay Patel
# CWID-20011070

def length(lst):
    """
    Function that returns length of list.
    """
    tot=0
    for i in lst:
        tot += 1

    return tot



# Q1
def dot(L,K):
    """
    Function that returns the dot product of two lists.
    L and K contain only numeric values
    """
    if length(K) == length(L) and length(K)!=0:
        return L[0] * K[0] + dot(L[1:], K[1:])
    elif length(K) != length(L) and length(K)!=0:
        return float('-inf')
    elif length(K) == length(L) and length(K)==0:
        return 0


# Q2
def explode(S):
    """
    A String Explosion function that takes a string as input and
    returns a list of all the characters in the string.
    """
    if not S:                       
        return []
    return [S[0]] + explode(S[1:])  



# Q3
def runningAverage(L):
    """
    Function that takes a list L and returns a new list where
    at each index n is the running average up to n in the original list
    """
    final = []     
    tot = 0     
    cnt = 0     
    for value in L:         
        tot += value         
        cnt += 1        
        final.append(tot / cnt)
    return final


# Q4
def customMap(f, L):
    """
    Function which takes in a function f and a list L and
    replicate the behavior of map
    """
    final = []
    for i in L:
        final += [f(i)]
    return final


def customFilter(f, L):
    """
    Function which takes in a function f and a list L and
    replicate the behavior of filter
    """
    final=[]
    for i in L:
        if f(i):
            final += [i]
    return final


def double(n):
    return n*2


def isEven(n):
    return n % 2 == 0
