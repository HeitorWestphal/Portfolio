#!/bin/bash
echo "qual das opções seguintes você deseja?
1 - Utilização para partições do sistema
2 - Exibir relação de usuários logados
3 - Exibir data e hora"
read opcao

if [ $opcao -eq 1 ]
then 
	df -h
elif [ $opcao -eq 2 ] 
then 
	whoami

elif [ $opcao -eq 3 ] 
then 
	date
	
else
	echo "opção indisponível"
fi
