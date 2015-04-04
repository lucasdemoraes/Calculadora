package org.educlasse

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonModel)
class CalculadoraModel {

    @Observable int clickCount = 0
    @Observable String tela = ''
    @Observable double primeiro_numero = 0
    @Observable double segundo_numero = 0
    @Observable String numero =''
    @Observable String operacao = ''
    @Observable double resultado = 0
}