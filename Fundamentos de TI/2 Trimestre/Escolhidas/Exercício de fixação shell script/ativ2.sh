#!/bin/bash
read -p "Antes da multiplicação, selecione o arquivo em que deseja salvar a multiplicação:" arq 
read -p "Digite o primeiro número: " num1
read -p "Digite o segundo número: " num2
resultado=$(($num1*$num2))
echo ""
 
echo "A multiplicação de $num1 e $num2 é: $resultado" >> $arq
echo ""
echo "O arquivo se encontra assim:"
cat -n $arq 
