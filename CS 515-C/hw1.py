# Q1
'''
To convert given input of celsius to Farenheit
'''
def cToF(t:float):
    x = t*(9/5)+32
    return x

'''
To convert given input of Farenheit to Celsius
'''
def fToC(t:float) -> float:
    y = (t-32)*5/9
    return y

# Q2
'''
Function which returns a list containing only the strings L with length shorter than n.
'''
def shortStrings(l:list, i:int) :
    
    z=list(filter(lambda x: len(x)<i, l))

    return z 

'''
Function which given a list of strings L, returns a new list of the same strings but doubled
'''
def doubleStrings(l:list) :
    
    z= list(map(lambda x:x*2,l))

    return z


# Q3
'''
    Function that takes in a string s and returns a list of characters
    where the list it returns is the string in pig latin.
'''
def pigLatin(s:str):
   
    z=list(s[1:] + s[0] + "ay")

    return z

# Q4 Extra Credit
'''
function called stringBalance(s) which takes a string s of lowercase
letters and returns a positive number, negative number, or zero depending on
- a negative number if the string has more letters from the first half of the
  alphabet
- 0 if the string has the same amount of letters from the first and second
  half of the alphabet
- a positive number if the string has more letters from the second half of
  the alphabet
'''
def stringBalance(n:str):

    one = ("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m")
    two = ("n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

    allone = filter(lambda x: x in one, n)
    alltwo = filter(lambda x: x in two, n)
    
    x = sum(map(lambda x: -1, allone))
    y = sum(map(lambda x: 1, alltwo))
    return  x + y

    

