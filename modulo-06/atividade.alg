algoritmo "Acordar"

var
    horario: inteiro
    alarme_tocando: logico
    vontade_de_levantar: logico
inicio
    horario <- 6
    alarme_tocando <- falso
    vontade_de_levantar <- falso

    se ( (horario >= 6) ) entao
        alarme_tocando <- verdadeiro
    fimse

    se ( (alarme_tocando = verdadeiro) ) entao
        escrever("O alarme está tocando.")        
        vontade_de_levantar <- verdadeiro
    fimse

    se ( (vontade_de_levantar = verdadeiro) ) entao
        escrever("Levante-se da cama.")
        escrever("Desligue o alarme.")        
        escrever("Vá ao banheiro.")        
        escrever("Escove os dentes.")        
        escrever("Tome um café da manhã.")    
    senao         
        escrever("Aperte o botão de soneca.")
    fimse

fimalgoritmo