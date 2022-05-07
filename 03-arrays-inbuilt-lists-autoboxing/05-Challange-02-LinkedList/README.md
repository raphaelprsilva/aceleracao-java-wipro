# `LinkedList` Challange 02

Crie um programa que implementa uma playlist para músicas.

Você deverá criar uma classe `Song` e ssa classe deve ter dois atributos.

- [ ] Crie uma classe `Song`
- [ ] Defina o atributo `title` (_título da música_) do tipo `String`
- [ ] Defina o atributo `duration` (_duração da música_) como `double`

Você também deverá criar uma classe chamada `Album` que terá uma lista de músicas. Os álbuns serão armazenados num `ArrayList`.

Músicas de diferentes álbuns podem ser adicionados à playlist e irão aparecer na ordem em que são adicionados.

Uma vez que as músicas forem adicionadas à playlist, deverá ter um menu de opções para sair, ir para a próxima música, voltar para a música anterior, reproduzir a música atual e listar as músicas na playlist.

Uma música precisa existir em um álbum antes de ser adicionada à playlist.

E por fim, defina uma opção de remover a música atual da playlist. (dica: `listIterator.remove()`).