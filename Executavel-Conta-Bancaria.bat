@echo off
:: Navega até o diretório onde o arquivo ContaBancaria.java está salvo
cd C:\Users\PC-CM-BONSUCESSO\Desktop\robozinhos-python\ProjetosJava

:: Compila o programa ContaBancaria.java
"C:\Program Files\Java\jdk-11\bin\javac.exe" ContaBancaria.java

:: Verifica se a compilação teve sucesso
if %errorlevel% neq 0 (
    echo Erro ao compilar o programa.
    pause
    exit /b
)

:: Executa o programa ContaBancaria
"C:\Program Files\Java\jdk-11\bin\java.exe" ContaBancaria

:: Pausa a execução para o usuário ver a saída antes de fechar
pause
