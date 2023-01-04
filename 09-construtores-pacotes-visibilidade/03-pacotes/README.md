# Pacotes - Organizando Classes

Imagine que você tenha 30 classes dentro da pasta `src`. Isso seria complicado gerenciar, não?

À medida em que os programas vão crescendo, fica difícil saber qual a responsabilidade das coisas.

Então, é melhor colocá-las em seu devido lugar, certo? Para isso, que servem os pacotes.

Além disso, em um mesmo projeto pessoas diferentes podem criar classes com os mesmos nomes.

Pacotes são diretórios/pastas com as responsabilidades delas.

Existe uma convenção para criação de pacotes:

1. Sempre comece com `com.nomeDaEmpresa`
   1. Seguido dos pacotes: `com.nomeDaEmpres.erp.comercial`
   2. Dificilmente alguma outra empresa terá uma assinatura de pacote parecida com essa;
   3. Se você não tiver um domínio registrado, crie por exemplo `com.github.prsraphael.erp`;
2. Nomes dos pacotes devem ser `lowercase`
