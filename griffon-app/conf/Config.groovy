application {
    title = 'calculadora'
    startupGroups = ['calculadora']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "calculadora"
    'calculadora' {
        model      = 'org.educlasse.CalculadoraModel'
        view       = 'org.educlasse.CalculadoraView'
        controller = 'org.educlasse.CalculadoraController'
    }
}