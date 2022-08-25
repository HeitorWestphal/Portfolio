#!/bin/bash
echo "Digite o diretório cujos componentes deseja listar:"
read dir
echo ""
echo "Os componentes deste diretório são:"
ls -a $dir
