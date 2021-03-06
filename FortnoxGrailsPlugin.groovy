import com.matchi.fortnox.domain.Contact
import com.matchi.fortnox.domain.Contacts
import com.matchi.fortnox.domain.Invoice
import com.matchi.fortnox.domain.InvoiceRow
import com.matchi.fortnox.domain.Item
import com.matchi.fortnox.domain.Items
import com.matchi.fortnox.utils.XmlHelper
import grails.converters.XML

class FortnoxGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Fortnox" // Headline display name of the plugin
    def author = "Carljohan Carlsson"
    def authorEmail = "carljohan.carlsson@gmail.com"
    def description = 'Grails plugin for integrating with Fortnox (www.fortnox.se) API'

    // URL to the plugin's documentation
    def documentation = "https://github.com/carkar/fortnox-grails-plugin"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "MATCHi", url: "http://www.matchi.se/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Carljohan Carlsson", email: "carljohan.carlsson@gmail.com" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [system: 'github', url: 'https://github.com/carkar/fortnox-grails-plugin/issues']

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/carkar/fortnox-grails-plugin" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        xmlHelper(XmlHelper)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
        println "Starting Fortnox plugin... "
        println "Fortnox API Base URL: ${applicationContext.fortnoxService.getBaseUrl()}"
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
