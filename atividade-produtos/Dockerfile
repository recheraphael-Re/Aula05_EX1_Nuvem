# Imagem base com o JDK 21
FROM eclipse-temurin:21-jdk

# Diretorio de trabalho dentro do container
WORKDIR /app

# Copia os arquivos-fonte da maquina para dentro da imagem
COPY Produto.java Main.java ./

# Compila as classes durante a construcao da imagem
RUN javac -encoding UTF-8 Produto.java Main.java

# Comando executado quando o container e iniciado
CMD ["java", "-Dstdout.encoding=UTF-8", "Main"]
