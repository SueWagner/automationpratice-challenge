# automationpratice-challenge

Automação de compra no site: automationpractice.com

Caso de teste: realizar uma compra com sucesso 

Configurações do ambiente para teste:
1.	Baixe e instale o Eclipse IDE;
2.	Baixe e instale o Java JDK e JRE para correta utilização;
3.	Verifique através do prompt de comando do Windows se o Java foi instalado corretamente, digitando:”java -version”;
4.	Baixe e instale o navegador Google Chrome;
	

Script de execução dos testes (steps):
1.	Tenha baixado no seu computador o Eclipse IDE;
2.	Baixe o projeto através deste git e o descompacte;
3.	Abra o Eclipse IDE;
4.	Dentro do eclipse clique em "File" e em "Open Projects from File System...";
5.	Na janela “Import source”, clique em "Directory" e selecione a pasta do projeto "automationpratice-dbserver" e clique em "OK";
6.	Clique em "Finish" e aguarde alguns segundos até o projeto ser aberto no Eclipse;
7.	Com o projeto aberto, clique em "src/main/java";
8.	Clique no pacote "testsuites" para expandi-lo;
9.	Clique com o botão direito do mouse sobre “RegressionTestSuite” e selecione a opção "Run As" e então “JUnit Test";
10.	Os testes então serão executados e após isto o JUnit informa, por meio de uma barra de cor verde ou vermelha, quais testes passaram e quais não: 

I.	O teste “RegisterTestCase” (teste referente ao cadastro) não irá passar, pois ao inserir um endereço de e-mail já cadastrado, ele apresentará a seguinte mensagem: “An account using this email address has already been registered. Please enter a valid password or request a new one.”. Pode-se inserir outro e-mail disponível para executar este teste (fazendo-se necessário alterar o e-mail no código) e então irá passar.
II.	O teste “PurchaseTestCase” (teste referente à compra), será executado corretamente, fazendo as verificações de validação nas páginas. Este teste aparecerá com cor verde, informando que o teste passou.
