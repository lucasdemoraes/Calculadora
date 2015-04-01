package Estudos

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonController)
class WorkspaceController {
    WorkspaceModel model

    void click() {
        model.clickCount++
    }
    void numero1() {
        model.tela = model.tela+'1'
        model.numero =  model.numero+'1'
    }
    void numero2() {
        model.tela = model.tela+'2'
        model.numero =  model.numero+'2'
    }
    void numero3() {
        model.tela = model.tela+'3'
        model.numero =  model.numero+'3'
    }
    void numero4() {
        model.tela = model.tela+'4'
        model.numero =  model.numero+'4'
    }
    void numero5() {
        model.tela = model.tela+'5'
        model.numero =  model.numero+'5'
    }
    void numero6() {
        model.tela = model.tela+'6'
        model.numero =  model.numero+'6'
    }
    void numero7() {
        model.tela = model.tela+'7'
        model.numero =  model.numero+'7'
    }
    void numero8() {
        model.tela = model.tela+'8'
        model.numero =  model.numero+'8'
    }
    void numero9() {
        model.tela = model.tela+'9'
        model.numero =  model.numero+'9'
    }
    void numero0() {
        model.tela = model.tela+'0'
        model.numero =  model.numero+'0'
    }
    void ponto() {
        model.tela = model.tela+'.'
        model.numero =  model.numero+'.'
    }
    void SomarAction(){
        model.tela = model.tela+' + '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.numero = ''
        model.operacao = '+'
    }
    void subtrairAction() {
        model.tela = model.tela+' - '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.numero = ''
        model.operacao = '-'
    }
    void multiplicarAction() {
        model.tela = model.tela+' * '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.numero = ''
        model.operacao = '*'
    }
    void dividirAction() {
        model.tela = model.tela+' / '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.numero = ''
        model.operacao = '/'
    }
    void raizAction(){
        model.tela = model.tela+' V = '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.resultado = Math.sqrt(model.primeiro_numero)
        model.numero = String.valueOf(model.resultado)
        model.tela = model.tela + model.numero
    }
    void potenciaAction(){
        model.tela = model.tela+' ^ '
        model.primeiro_numero = Double.parseDouble(model.numero)
        model.numero = ''
        model.operacao = '^'
    }
    void limpaTelaAction(){
        model.tela = ''
        model.numero = ''
        model.primeiro_numero = 0
        model.segundo_numero  = 0
    }
    void clickIgual(){
        model.segundo_numero = Double.parseDouble(model.numero)

        if (model.operacao == '+')
             model.resultado =  model.primeiro_numero + model.segundo_numero
        if(model.operacao == '-')
            model.resultado = model.primeiro_numero - model.segundo_numero
        if(model.operacao == '*')
            model.resultado = model.primeiro_numero * model.segundo_numero
        if(model.operacao == '/')
            model.resultado = model.primeiro_numero / model.segundo_numero
        if(model.operacao == '^')
            model.resultado = Math.pow(model.primeiro_numero, model.segundo_numero)

        model.numero = String.valueOf(model.resultado)
        model.tela = model.tela + ' = ' + model.numero

        if(model.operacao == '')
            model.tela = 'ERRO!'

        model.operacao = ''
    }

}