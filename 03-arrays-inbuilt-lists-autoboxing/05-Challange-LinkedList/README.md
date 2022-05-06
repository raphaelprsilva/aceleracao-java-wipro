# `LinkedList` Challange

Crie um programa que implemente uma lista de reprodução de músicas.

Para começar, implemente as seguintes classes:

## 1. `Album`

- Possui três atributos, duas `Strings` chamadas `name` e `artista`, e um `ArrayList` que contém objetos do tipo `Song` chamados `songs`.

- Um `construtor` que aceita **duas** `Strings` (nome do álbum e artista). Ele inicializa os campos e instancia `songs`.

Também possui **4 métodos**:

- `addSong()`, possui **dois** parâmetros do tipo `String` (**título da música**), `double` (**duração da música**) e retorna um `boolean`. Retorna `true` se a música foi adicionada com sucesso ou `false` caso contrário.

- `findSong()`, possui **um** parâmetro do tipo `String` (**título da música**) e retorna um `Song`. Retorna o `Song` se existir, `null` se não existir.

- `addToPlayList()`, possui dois parâmetros do tipo `int` (**número da faixa da música no álbum**) e `LinkedList` (**a playlist**) que contém objetos do tipo `Song` e retorna um `boolean`. Retorna `true` se existir e foi adicionado com sucesso usando o número da faixa da música, ou `false` caso contrário.

- `addToPlayList()`, possui dois parâmetros do tipo `String` (**título da música**) e `LinkedList` (**a playlist**) que contém objetos do tipo `Song` e retorna um `boolean`. Retorna `true` se existir e foi adicionado com sucesso usando o nome da música, ou `false` caso contrário.

## 2. `Song`

Essa classe tem dois atributos:

- um do tipo `String` chamado `title`
- e um `double` chamado `duration`

Um `construtor` que aceita:

- uma `String` (**título da música**)
- e um `double` (**duração da música**)
- o **título** e **duração** são inicializados.

E **dois** métodos, são eles:

- `getTitle()`, `getter` para título.

- `toString()`, músicas (`songs`) que substituem o método `toString`. Retorna uma `String` no seguinte formato: "`título: duração`"

### Exemplos de Entrada

``` java
ArrayList<Album> albums = new ArrayList<>();

Album album = new Album("Stormbringer", "Deep Purple");
album.addSong("Stormbringer", 4.6);
album.addSong("Love don't mean a thing", 4.22);
album.addSong("Holy man", 4.3);
album.addSong("Hold on", 5.6);
album.addSong("Lady double dealer", 3.21);
album.addSong("You can't do it right", 6.23);
album.addSong("High ball shooter", 4.27);
album.addSong("The gypsy", 4.2);
album.addSong("Soldier of fortune", 3.13);
albums.add(album);

album = new Album("For those about to rock", "AC/DC");
album.addSong("For those about to rock", 5.44);
album.addSong("I put the finger on you", 3.25);
album.addSong("Lets go", 3.45);
album.addSong("Inject the venom", 3.33);
album.addSong("Snowballed", 4.51);
album.addSong("Evil walks", 3.45);
album.addSong("C.O.D.", 5.25);
album.addSong("Breaking the rules", 5.32);
album.addSong("Night of the long knives", 5.12);
albums.add(album);

LinkedList<Song> playList = new LinkedList<Song>();
albums.get(0).addToPlayList("You can't do it right", playList);
albums.get(0).addToPlayList("Holy man", playList);
albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
albums.get(0).addToPlayList(9, playList);
albums.get(1).addToPlayList(3, playList);
albums.get(1).addToPlayList(2, playList);
albums.get(1).addToPlayList(24, playList);  // There is no track 24
```

> **DICA**: na classe `Album`, use o método `findSong()` em `addSong()` e `addToPlayList(String, LinkedList)` para verificar se existe uma música antes de continuar.

> **DICA**: Tenha muito cuidado com a grafia dos nomes dos campos, construtores e métodos.

> **DICA**: Tenha muito cuidado com espaços e ortografia na `String` retornada do método `toString()`.

> **DICA**: Todos os atributos das classes são privados.

> **DICA**: todos os construtores são públicos.

> **DICA**: todos os métodos são públicos (exceto `findSong()`, que é privado).

> **DICA**: Não há membros estáticos.