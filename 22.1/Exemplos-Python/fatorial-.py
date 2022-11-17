import unittest

def fat(n):
    fatorial = 1
    for i in range(1,n+1):
        fatorial *= i
    return fatorial

# assert fat(5) < 0

class Test(unittest.TestCase):
    def test(self):
        self.assertEqual(fat(5), 121)

    def test2(self):
        self.assertEqual(fat(0), 1)


unittest.main()
