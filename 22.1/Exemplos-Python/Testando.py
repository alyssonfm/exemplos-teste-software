import Pilha
import unittest

class TestPilha(unittest.TestCase):
    def setUp(self):
        self.pilha = Pilha.Pilha()

    def test_isEmpty(self):
        self.assertTrue(self.pilha.is_empty())

    def test_push(self):
        self.assertEqual(self.pilha.size(), 0)
        self.pilha.push(10)
        self.assertEqual(self.pilha.size(), 1)
        self.pilha.push(1)
        self.assertEqual(self.pilha.size(), 2)
        self.assertFalse(self.pilha.is_empty())

    def tear_down(self):
        self.pilha = None
    
unittest.main()

