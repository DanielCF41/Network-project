# Correção do Projeto Prático 02

## Entregas e requisitos para o desenvolvimento da solução

1. Modelagem UML
   - [x] Diagrama de classes salvo em um arquivo chamado `modelagem.png` na raiz do repositório (ou no Readme.md caso faça com o Mermaid)
   - [x] Notação correta de associação entre classes, representação de atributos e métodos
   - [x] Herança, devendo representar corretamente classes e métodos abstratos e interfaces
2. Implementação
   - [ ] Encapsulamento, responsabilidade única e divisão de responsabilidades
   - [ ] Uso correto dos conceitos de Herança e Polimorfismo com sobrescrita de métodos
   - [ ] Uso de enumerações e coleções
   - [x] Comportamento correto das classes modeladas  
   - [x] Comportamento correto da classe que possui método `main`
3. Projeto Java com Gradle
   - [x] Arquivo `.gitignore` adequado ao projeto 
   - [x] Possível compilar e executar o projeto via `./gradlew -q run`. Conceito 0 caso não seja possível.
4. Arquivo Readme.md na raiz do repositório
   - [x] Instruções para criar uma nova regra de filtragem, um novo pacote IP e simular o processamento do pacote
   - [x] Indicar quais funcionalidades foram implementadas e quais não foram

## Comentários

- Porta da regra está limitando a 12, quando deveria ser 65535. É a porta do protocolo TCP/UDP e não a porta do dispositivo.
- Não fez uso de enumerações.
- Não fez uso de polimorfismo.
- Nota: 8,5

