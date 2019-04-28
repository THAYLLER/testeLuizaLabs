# TESTE LUIZALABS

## Linguagens e frameworks usados

* [x] BackEnd - API REST JAVA
  * [x] JAVA
  * [x] MAVEN
  * [x] SPRING BOOT
* [x] FrontEnd- API que vai consumir o REST
  * [x] Bootstrap
  * [x] PHP 5
  
## PROPOSTA DESSE PROJETO
Desenvolver uma api rest, que realize consultas em GET no intuito de filtar informações dos arquivos NFe.txt e NFeTran.txt

# BackEnd
Para iniciar os testes entre na pasta testeLabs, em seguida em apiRest > target, lá estará o arquivo: apiRest-0.0.1-SNAPSHOT.jar.
Para executar o arquivo entre em um terminal dos ou shell e insira o comando:

```
java -jar apiRest-0.0.1-SNAPSHOT.ja
```

## AndPoints 

```
http://localhost:8080/nfe/filter/all
http://localhost:8080/nfe/filter/periodoTipoSomatorio/{tipo}?dataA=""&dataD=""
http://localhost:8080/nfe/filter/periodoTipo/{tipo}?dataA=""&dataD=""
http://localhost:8080/nfe/filter/status/{nfeStatus}
http://localhost:8080/nfe/filter/doc/{nfeDoc}
http://localhost:8080/nfe/filter/chave/{nfeChave}
http://localhost:8080/nfe/tran/filter/estatistica/sucesso
http://localhost:8080/nfe/tran/filter/estatistica/error
http://localhost:8080/nfe/tran/filter/sefaz/{nfeEstado}
http://localhost:8080/nfe/tran/filter/chave/{nfeChave}
```

# FrontEnd

Foi criado um layout simples apenas para consumir a api, dentro da pasta apiRest, tempos apiConsomeRet-ui, entre na pasta e via terminal execute o comando:


```
php -S localhost:8000
```

E no navegador insira: http://localhost:8000 para que a aplicação rode