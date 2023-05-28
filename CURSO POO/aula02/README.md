# Configurando Visibilidade de Atributos e Métodos.

A visibilidade de atributos e métodos se refere a quem tem acesso a esses elementos em uma classe. Ela controla a forma como os membros da classe podem ser acessados e manipulados por outras partes do programa.

Existem quatro níveis de visibilidade:

Public (Público): Os membros declarados como públicos são acessíveis de qualquer lugar, ou seja, em qualquer classe ou pacote. Eles podem ser acessados diretamente, sem a necessidade de métodos intermediários.

Private (Privado): Os membros declarados como privados só podem ser acessados dentro da própria classe em que foram declarados. Eles não podem ser acessados diretamente de fora da classe. Normalmente, métodos privados são usados para auxiliar a implementação interna da classe e não devem ser acessados por outras classes.

Protected (Protegido): Os membros declarados como protegidos são acessíveis dentro da mesma classe, em subclasses dessa classe e em outros membros do mesmo pacote. Eles não podem ser acessados fora do pacote a não ser por meio de herança.

Default (Padrão): Quando nenhum modificador de visibilidade é especificado, o membro é considerado de visibilidade padrão (ou seja, sem modificador). Nesse caso, os membros são acessíveis apenas dentro do mesmo pacote. Eles não podem ser acessados fora do pacote, nem mesmo por meio de herança.

Ao definir a visibilidade de atributos e métodos, é importante seguir os princípios de encapsulamento e abstração, permitindo acesso controlado aos membros da classe e fornecendo interfaces bem definidas para interagir com eles.

Neste exercicio pratiquei os atributos e metodos. A classe "Caneta" possui atributos com diferentes visibilidades: cor é privado, marca é público, tampa é protegido e modelo é de visibilidade padrão (sem especificação de modificadores). Da mesma forma, os métodos possuem diferentes visibilidades: escrever() é privado, destampar() é público e tampar() é protegido, enquanto exibirInformacoes() é de visibilidade padrão.