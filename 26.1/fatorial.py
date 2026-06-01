def fat(n):
    '''Retorna o fatorial de n
    >>> fat(0)
    1
    >>> fat(5)
    121
    '''
    fatorial = 1
    for i in range(1,n+1):
        fatorial *= i
    return fatorial

assert fat(5) >= 0
