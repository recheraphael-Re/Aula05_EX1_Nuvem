# Imagem base com o JDK 21
FROM eclipse-temurin:21-jdk

# Diretorio de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos .java para dentro da imagem
COPY *.java ./

# Compila todas as classes durante a construcao da imagem
RUN javac -encoding UTF-8 *.java

# Comando executado quando o container e iniciado
CMD ["java", "-Dstdout.encoding=UTF-8", "Main"]
