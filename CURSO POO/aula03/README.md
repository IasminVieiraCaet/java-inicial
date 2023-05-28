# Relacionamento de classes na POO

O relacionamento entre classes na Programação Orientada a Objetos (POO) é uma das principais características desse paradigma. Ele permite que as classes se relacionem entre si para modelar a estrutura e o comportamento de um sistema.

Existem três tipos principais de relacionamentos entre classes na POO:

Associação:
A associação é um relacionamento básico entre duas classes, indicando que uma classe está de alguma forma relacionada à outra. Essa relação pode ser de dependência ou de uso mútuo de recursos. Por exemplo, uma classe "Carro" pode ter uma associação com uma classe "Motor", pois um carro usa um motor para funcionar. A associação é geralmente representada por uma linha entre as classes envolvidas.

Agregação:
A agregação é um tipo específico de associação que indica uma relação "todo-parte" entre duas classes. Nesse relacionamento, uma classe é composta por outras classes, mas as classes associadas podem existir independentemente. Por exemplo, uma classe "Universidade" pode ter uma agregação com a classe "Departamento", pois a universidade é composta por vários departamentos, mas esses departamentos também podem existir de forma independente. A agregação é geralmente representada por um losango oco no lado da classe "todo" (por exemplo, a classe "Universidade") e uma linha no lado da classe "parte" (por exemplo, a classe "Departamento").

Composição:
A composição é um relacionamento mais forte que indica uma relação "todo-parte" em que as partes não podem existir independentemente da classe "todo". Nesse relacionamento, a classe "todo" é responsável pela criação e destruição das partes. Por exemplo, uma classe "Casa" pode ter uma composição com a classe "Quarto", pois os quartos só existem dentro da casa e são criados e destruídos junto com a casa. A composição é geralmente representada por um losango preenchido no lado da classe "todo" (por exemplo, a classe "Casa") e uma linha no lado da classe "parte" (por exemplo, a classe "Quarto").

# Explicando o projeto:

A classe Carro é uma representação de um carro em um sistema orientado a objetos. 

A classe Carro é declarada com o modificador public, o que significa que ela pode ser acessada de outros pacotes.
A classe possui um campo "private Motor motor", que representa o motor associado ao carro. O modificador "private" indica que esse campo só pode ser acessado internamente dentro da classe Carro.

O construtor public Carro() é um método especial que é chamado quando um objeto da classe "Carro" é criado. Neste caso, o construtor instancia um objeto da classe Motor e atribui à variável motor. Isso significa que cada objeto Carro terá um motor associado a ele.

O método public void ligar() é responsável por ligar o carro. Ele exibe uma mensagem indicando que o carro foi ligado e chama o método iniciar() do objeto motor. Isso implica que o motor do carro também é iniciado quando o carro é ligado.

O método public void desligar() é responsável por desligar o carro. Ele exibe uma mensagem indicando que o carro foi desligado e chama o método parar() do objeto motor. Isso significa que o motor do carro também é parado quando o carro é desligado.

Portanto, a classe Carro possui um relacionamento de composição com a classe Motor, indicando que um carro é composto por um motor. O motor é criado dentro do construtor do carro e pode ser acessado pelos métodos ligar() e desligar(), nos quais são chamados métodos específicos do motor para iniciar e parar o motor.

A classe Motor representa um motor em um sistema orientado a objetos. 

A classe "Motor" é declarada com o modificador public, o que significa que ela pode ser acessada de outros pacotes.

A classe não possui campos, pois é uma representação simples do motor.

A classe possui dois métodos públicos: iniciar() e parar().

O método public void iniciar() exibe uma mensagem indicando que o motor foi iniciado. Neste exemplo, a mensagem impressa é "Motor iniciado".

O método public void parar() exibe uma mensagem indicando que o motor foi parado. A mensagem impressa é "Motor parado".

Na classe Carro, que foi mencionada anteriormente, a classe Motor é usada como parte da composição do carro. Isso significa que a classe Carro possui um objeto da classe Motor como um de seus campos e pode chamar os métodos do objeto Motor para controlar o funcionamento do motor do carro.

O relacionamento entre as classes Carro e Motor demonstra como a POO permite criar estruturas complexas por meio do uso de classes relacionadas entre si. Essa abordagem modular e de composição facilita a modelagem de sistemas em que diferentes componentes têm comportamentos específicos e interagem entre si para cumprir um objetivo comum.