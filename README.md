# curso-java
Java programming logic course using Debian 10. Curso de lógica de programação em Java utilizando o Debian 10.

Para utilzar o Java no Debian podemos instalar os pacotes default-jre e default-jdk utilizando o comando apt.

Para nos certificarmos que o sistema está com os pacotes e bibliotecas atualizados utilizamos o comando abaixo:

	# apt update && apt upgrade

Para evitar instalações erradas veremos se o Java está instalado na máquina com o comando:

	$java -version

Se o retorno desse comando for “The program java can be found in the following packages” significa que o Java não se encontra instalado no computador. Para isso instalaremos os pacotes do Java Runtime Environment (JRE) com o comando:

	# apt install default-jre

Com isso podemos instalar o Java Development Kit (JDK) que é necessário para fazer a compilçação das nossas aplicações Java.

	# apt install default-jdk


Para confirmar qual a versão do java está instalado no computador execute o comando:

	$java -version
