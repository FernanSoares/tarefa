# tarefa

README

Conexão com o Banco de Dados
Problemas Identificados

Inicialização e Verificação da Conexão

A variável conn é inicializada como null e utilizada sem verificação adequada. Isso pode causar um NullPointerException caso a conexão não seja estabelecida corretamente.

Dados Sensíveis na String de Conexão

Valores como o usuário "lopes" e a senha "123" estão hardcoded no código. Essa prática é insegura e expõe informações sensíveis.

Recomendação
Verificação da Conexão: Certifique-se de verificar se a variável conn foi corretamente inicializada antes de utilizá-la.

Gerenciamento de Credenciais: Armazene credenciais em variáveis de ambiente ou em um arquivo de configuração protegido.

Consulta SQL

Problemas Identificados

Concatenação de Strings
A consulta SQL é construída utilizando concatenação de strings.
Essa prática pode levar a vulnerabilidades de SQL Injection.

Recomendação
Utilize prepared statements ou query parametrizadas para proteger o código contra SQL Injection e melhorar a segurança.

Tratamento de Exceções
Problemas Identificados

Tratamento Superficial

O tratamento de exceções apenas retorna a variável result sem fornecer detalhes sobre o erro.
Isso dificulta a depuração e a manutenção do código.

Recomendação
Captura Detalhada: Implemente um tratamento de exceções mais robusto, registrando detalhes úteis para análise e resolução de problemas.
Considere utilizar logs para capturar informações críticas.

Nomenclatura e Formatação
Problemas Identificados

Nomes Pouco Descritivos

Variáveis e métodos possuem nomes que não representam claramente suas funções. Isso dificulta a leitura e o entendimento do código.

Formatação Inconsistente

O código apresenta problemas de indentação e formatação, reduzindo a legibilidade.

Complexidade Ciclomática e Base de Caminhos

Cálculo da Complexidade Ciclomática
Fórmula Utilizada: V(G) = E - N + 2

Variáveis:

V(G): Complexidade Ciclomática
E: Número de arestas
N: Número de nodos

Dados do Grafo:

Número de arestas (E): 3
Número de nodos (N): 3

Cálculo:
V(G) = 3 - 3 + 2 = 2

Base de Caminhos
Caminhos Identificados:

conectarBD() -> verificarUsuario(login, senha) -> return result
verificarUsuario(login, senha) -> return result

Nota: Análise de complexidade ciclomática para compreensão do fluxo de controle do código.
