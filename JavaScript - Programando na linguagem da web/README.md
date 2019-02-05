# JavaScript: Programando na linguagem da web

## Aula 01 - Introdução

### Atividade 04 - Olá Mundo com JavaScript:

- Adicionado projeto base "introducao-javascript";

#### Saída de dados:

- alert(""): função JavaScript que mostra um pop-up na tela;
- console.log(""): função JavaScript que mostra uma mensagem no console do desenvolvedor (browser);

### Atividade 07 - Query Selector:

- DOM (Document Object Model): é a representação do HTML no JavaScript;
- document: palavra-chave utilizada para acessar o DOM. Toda a página é representada pelo 'document';
- querySelector(""): função do 'document' que retorna uma pesquisa do elemento da página equivalente ao parâmetro da função;
- É uma boa prática colocar os scripts no final do corpo da página, para garantir que os elementos estejam carregados quando forem chamados;
- textContent: propriedade de um elemento com o conteúdo de texto dele;

### Atividade 08 - Boas Práticas:

#### Query Selector:

- Além da tag, a função querySelector("") também aceita receber, como parâmetro, um id, classe ou seletor CSS;

- É uma boa prática separar todo o código JavaScript do código HTML e do código CSS. Para isso, cria-se um documento de extensão .js, e chama-o no HTML da página desejada;


## Aula 02 - Variáveis e Operadores

### Atividade 01 - Buscando dados do paciente:

- É possível utilizar o 'querySelector("")' em uma variável que não seja o 'document';


## Aula 03 - Arrays, Loop e Estilos

### Replicando a validação e o cálculo do IMC para todos os pacientes:

- querySelector(""): retorna apenas um elemento;
- querySelectorAll(""): retorna um vetor com todos os elementos;
- variavel.length: propriedade de um vetor que representa o seu número de posições;
- variavel.toFixed(numero): função retorna o valor de 'variavel' com a quantidade de casas decimais do parâmetro 'numero';