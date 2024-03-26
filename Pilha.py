class Pilha:
    def __init__(self):
        self.dados = []

    def push(self, item):
        self.dados.append(item)

    def pop(self):
        if not self.is_empty():
            return self.dados.pop(-1)

    def size(self):
        return len(self.dados)

    def stackpop(self):
        if not self.is_empty():
            return self.dados[-1]

    def is_empty(self):
        return len(self.dados) == 0
