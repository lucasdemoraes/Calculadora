package Estudos

import griffon.core.artifact.GriffonView
import griffon.metadata.ArtifactProviderFor
import javax.swing.SwingConstants
import javax.swing.JLabel
import java.awt.BorderLayout
import java.awt.Button
import java.awt.FlowLayout
import java.awt.Panel
import java.awt.color.ColorSpace
import java.lang.invoke.SwitchPoint
import javax.swing.BorderFactory

@ArtifactProviderFor(GriffonView)
class WorkspaceView {
    FactoryBuilderSupport builder
    WorkspaceModel model

    void initUI() {
        builder.with {
            actions {
                action(somarAction,
                        shortDescription: "Adicionar")
                action(subtrairAction,
                        shortDescription: "Subtrair")
                action(multiplicarAction,
                        shortDescription: "Multiplicar")
                action( dividirAction,
                        shortDescription: "Dividir")
                action(limpaTelaAction,
                        shortDescription: "Limpa Tela")
                action(raizAction,
                        shortDescription: "Raíz Quadrada")
                action(potenciaAction,
                        shortDescription: "Potenciação")
            }
            application(size: [280, 180], id: 'mainWindow',
                    title: application.configuration['application.title'],
                    iconImage: imageIcon('/griffon-icon-48x48.png').image,
                    iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                                 imageIcon('/griffon-icon-32x32.png').image,
                                 imageIcon('/griffon-icon-16x16.png').image]) {
                borderLayout()
                panel (constraints: BorderLayout.PAGE_START) {
                    flowLayout(alignment: FlowLayout.CENTER)
                    label(id: 'clickLabel', text: bind { model.tela },
                         horizontalAlignment: SwingConstants.CENTER)
                }
                panel (constraints: BorderLayout.CENTER) {
                    panel(constraints: BorderLayout.CENTER) {
                        gridLayout(rows: 4, cols: 3)
                        button(id: 'button1', numero1Action, text: '1')
                        button(id: 'button2', numero2Action, text: '2')
                        button(id: 'button3', numero3Action, text: '3')
                        button(id: 'button4', numero4Action, text: '4')
                        button(id: 'button5', numero5Action, text: '5')
                        button(id: 'button6', numero6Action, text: '6')
                        button(id: 'button7', numero7Action, text: '7')
                        button(id: 'button8', numero8Action, text: '8')
                        button(id: 'button9', numero9Action, text: '9')
                        button(id: 'button,', pontoAction, text: '.')
                        button(id: 'button0', numero0Action, text: '0')

                    }
                    panel (constraints: BorderLayout.EAST) {
                        gridLayout(rows: 4, cols: 3)
                        button(id: 'Button+', somarAction, text: '+')
                        button(id: 'Button-', subtrairAction, text: '-')
                        button(id: 'Button*', multiplicarAction, text: '*')
                        button(id: 'Button/', dividirAction, text: '/')
                        button(id: 'Button=', raizAction, text: 'V')
                        button(id: 'Button^', potenciaAction, text: '^')
                        button(id: 'Button=', clickIgualAction, text: '=')
                        button(id: 'ButtonCE', limpaTelaAction, text: 'CE')

                    }
                }

            }
        }
    }
}