<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Projeto Java: Utilização da Anotação @Tabela">
    <meta name="keywords" content="Java, Anotação, @Tabela, Projeto">
    <meta name="author" content="Ana Alice Rodrigues">
    <title>Projeto Java: Utilização da Anotação @Tabela</title>
</head>
<body>

<header>
    <h1>Projeto Java: Utilização da Anotação <code>@Tabela</code></h1>
    <img src="./img/anotacions1.png" alt="resultado" width="300" height="auto">
</header>

<details>
    <summary>Índice</summary>
    <ol>
        <li><a href="#sobre-o-projeto">Sobre o projeto</a></li>
        <li><a href="#parte-tecnica">Parte Técnica</a></li>
        <li><a href="#estrutura-dos-arquivos">Estrutura dos Arquivos</a></li>
        <li><a href="#casos-de-uso">Casos de Uso</a></li>
        <li><a href="#ferramentas">Ferramentas</a></li>
        <li><a href="#contato">Contato</a></li>
    </ol>
</details>

<section id="sobre-o-projeto">
    <h2>Sobre o projeto</h2>
    <p>Este projeto demonstra o uso de anotações personalizadas em Java, especificamente a anotação <code>@Tabela</code>. O objetivo é mostrar como criar, aplicar e processar anotações em classes Java. A anotação <code>@Tabela</code> é usada para associar uma classe a uma tabela de banco de dados fictícia.</p>
    <p>Proposta de Valor: Facilitar a associação de metadados a classes, permitindo uma abordagem mais modular e configurável no design de software.</p>
</section>

<section id="parte-tecnica">
    <h2>Parte Técnica</h2>
    <ul>
        <li>Backend: Implementado em Java, utilizando anotações personalizadas para associar classes a tabelas de banco de dados.</li>
        <li>Frontend: Não aplicável neste projeto.</li>
        <li>Banco de Dados: Não aplicável diretamente, mas a estrutura demonstra a associação a tabelas de banco de dados fictícias.</li>
    </ul>
</section>

<section id="estrutura-dos-arquivos">
    <h2>Estrutura dos Arquivos</h2>
    <ul>
        <li><strong>src/AnotacaoTabela/Tabela.java:</strong> Define a anotação <code>@Tabela</code> com o elemento <code>nome</code>.</li>
        <li><strong>src/AnotacaoTabela/Main.java:</strong> Contém a classe principal que verifica a presença da anotação <code>@Tabela</code> na classe <code>Usuario</code> e imprime o nome da tabela associada.</li>
        <li><strong>src/AnotacaoTabela/Usuario.java:</strong> Anota a classe <code>Usuario</code> com <code>@Tabela</code>, associando-a à tabela "usuarios".</li>
    </ul>
</section>

<section id="casos-de-uso">
    <h2>Casos de Uso</h2>
    <ul>
        <li>Demonstrar como criar e aplicar anotações personalizadas em Java.</li>
        <li>Facilitar a associação de classes Java a tabelas de banco de dados de forma modular e configurável.</li>
    </ul>
</section>

<section id="ferramentas">
    <h2>Ferramentas</h2>
    <ul>
        <li><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Badge Java"></li>
        <li><img src="https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellij%20idea&logoColor=white" alt="Badge IntelliJ IDEA"></li>
        <li><img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Badge Git"></li>
        <li><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="Badge GitHub"></li>
    </ul>
</section>

<section id="contato">
    <h2>Contato</h2>
    <ul>
        <li><a href="https://linktr.ee/anaeanali5" target="_blank"><img src="https://img.shields.io/badge/Ana_Alice_Rodrigues-blue?style=for-the-badge" alt="Perfil de Ana Alice Rodrigues"></a></li>
    </ul>
    <p>Este projeto foi desenvolvido por Ana Alice Rodrigues. Para mais informações, acesse o perfil no Linktree.</p>
</section>

</body>
</html>
