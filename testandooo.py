import unittest

def fat(n):
    fatorial = 1
    for i in range(1,n+1):
        fatorial *= i
    return fatorial


class Test(unittest.TestCase):
    def test(self):
        self.assertEqual(120, fat(5))
        self.assertEqual(1, fat(0))

    def test2(self):
        self.assertEqual("alysson", "ALYSSON".lower())

    def testString(self):
        self.assertFalse("alysson".islower())

    def testString2(self):
        self.assertFalse("alysson".isupper())

unittest.main()
