TRABALHO 01
Objetivo
Desenvolver um pequeno sistema em Java que utilize os principais conceitos da Programação Orientada a Objetos:
•	Classe e Objeto
•	Métodos
•	Construtores
•	Herança
•	Polimorfismo
•	Encapsulamento
•	Modificadores de acesso
Sistema de Gestão de Veículos
Descrição:
Crie um sistema simples que simule o gerenciamento de veículos de uma concessionária.
O programa deve permitir cadastrar veículos, exibir informações e simular ações específicas de cada tipo de veículo.
Requisitos obrigatórios
1.	Classe base:
Crie uma classe Veiculo com:
o	Atributos privados: marca, modelo, ano.
o	Construtor para inicializar os atributos.
o	Métodos públicos ligar() e mostrarInfo().
o	Getters e setters para os atributos.

2.	Herança:
Crie pelo menos duas subclasses que herdem de Veiculo, como:
o	Carro
o	Moto

3.	Polimorfismo:
o	Sobrescreva o método ligar() em cada subclasse, exibindo mensagens diferentes, por exemplo:
"Carro ligado com chave."
"Moto ligada com pedal."

4.	Encapsulamento:
o	Todos os atributos devem ser private, e o acesso feito por métodos get e set.

5.	Modificadores de acesso:
o	Use public nos métodos e private nos atributos.
o	Utilize protected se quiser permitir acesso controlado nas subclasses.

6.	Classe principal (Main):
o	Crie objetos das subclasses.
o	Chame seus métodos para demonstrar o funcionamento.
