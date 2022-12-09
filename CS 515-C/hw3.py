'''
Namra Patel - 20011070
'''


# Q1
# Write a function spiral(L) which takes in a two-dimensional list L and returns a new list containing the numbers in spiral order, starting from L[0][0] and going clockwise.
def spiral(matrix):
    if not matrix or not matrix[0]:
        return []
    answer = []
    a = 0
    b = len(matrix)
    c = 0
    d = len(matrix[0])
    while b > a and d > c:
        for x in range(c, d):
            answer.append(matrix[a][x])
        for y in range(a+1, b-1):
            answer.append(matrix[y][d-1])
        if b != a+1:
            for x in range(d-1, c-1, -1):
                answer.append(matrix[b-1][x])
        if c != d-1:
            for y in range(b-2, a, -1):
                answer.append(matrix[y][c])
        a += 1
        b -= 1
        c += 1
        d -= 1
    return answer


# Q2
# Write a function inverter(D) which takes a dictionary D and returns a new dictionary with the keys and values swapped.
def inverter(D):
    b = {}
    for x,y in D.items():
        b[y] = b.get(y,[]) + [x]

    for x,y in b.items():
        if len(y) == 1:
            b[x] = y[0]
    
    return b 


# Q3
# Write the function matrixMultiply(A,B) that takes in two 2-D arrays A and B. 
# It treats these lists as matrixes and multiplies them together. 
# If the dimensions are incompatible, it raises an ArimthmeticError.
def matrixMultiply(Mat1,Mat2):
    C1=len(Mat1[0])
    R1=len(Mat1)

    C2=len(Mat2[0])
    R2=len(Mat2)

    result=[]
    for x in range(R1):
        r=[]
        for y in range(C2):
            r.append(0)
        result.append(r)
        
    if C1==R2:
        for x in range(R1):
            for y in range(C2):
                for k in range(R2):
                    result[x][y]+=Mat1[x][k]*Mat2[k][y]
        return result
    else:
        raise ArithmeticError


# Q4
# Write the function twoSum(L,t) that takes a list L and a target number t and returns the list of all pairs of two numbers in L that sum to t. 
def twoSum(L,t):
    s=[]
    for x in range (len(L) - 1):
        for y in range (x,len(L) - 1):
            if (L[x] + L[y] ) == t and x != y:
                s.append((L[x], L[y]))
    return s
