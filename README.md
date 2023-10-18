# tdd-workshop
Repositório destinado para o workshop de TDD.

## 🎟️ Gestão de Cupons

### Cadastrar cupom

- Os cupons podem ter valor fixo em reais ou em porcentagem
- A quantidade deve ser maior que zero

### Exibir cupom

- Caso consulte um cupom que não exista, é esperado um erro
- Caso porcentagem, o valor do cupom é exibido com “%”
- Caso valor fixo, o valor do cupom é exibido com “R$”

### Usar cupom

- Ao usar um cupom, a quantidade de cupons é subtraída
- Se tentar usar um cupom que tem quantidade igual a 0, é esperado um erro
