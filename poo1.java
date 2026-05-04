class Pessoa:
    def __init__(self,nome,fone,cpf):
        self.nome = nome
        self.fone = fone
        self.cpf = cpf

    def saudar(self):
        print("Olá, meu nome é", self.nome)


class Aluno(Pessoa):
    def __init__(self,nome,fone,cpf,matricula):
        super().__init__(nome,fone,cpf)
        self.matricula = matricula

    def aprender(self):
        print(self.nome, "está aprendendo")


class Professor(Aluno):
    def __init__(self,nome,fone,cpf,matricula,titulo):
        super().__init__(nome,fone,cpf,matricula)
        self.titulo = titulo

    def ensinar(self):
        print(self.nome,"está ensinando")


class Funcionario(Pessoa):
    def __init__(self,nome,fone,cpf,cod,funcao):
        super().__init__(nome,fone,cpf)
        self.cod = cod
        self.funcao = funcao

    def desempenhar_funcao(self):
        print(self.nome,"trabalha como",self.funcao)
