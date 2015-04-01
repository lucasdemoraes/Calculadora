package Estudos

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

import java.awt.Dimension

@ArtifactProviderFor(GriffonModel)
class WorkspaceModel {
    @Observable int clickCount = 0
    @Observable String tela = ''
    @Observable double primeiro_numero = 0
    @Observable double segundo_numero = 0
    @Observable String numero =''
    @Observable String operacao = ''
    @Observable double resultado = 0

}