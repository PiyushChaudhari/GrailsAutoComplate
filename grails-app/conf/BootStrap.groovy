import com.grails.Domain.AutoComplate;

class BootStrap {

    def init = { servletContext ->
			new AutoComplate(name:"ActionScript").save(flash:true)
			new AutoComplate(name:"AppleScript").save(flash:true)
			new AutoComplate(name:"Asp").save(flash:true)
			new AutoComplate(name:"BASIC").save(flash:true)
			new AutoComplate(name:"C").save(flash:true)
			new AutoComplate(name:"C++").save(flash:true)
			new AutoComplate(name:"Clojure").save(flash:true)
			new AutoComplate(name:"COBOL").save(flash:true)
			new AutoComplate(name:"ColdFusion").save(flash:true)
			new AutoComplate(name:"Erlang").save(flash:true)
			new AutoComplate(name:"Fortran").save(flash:true)
			new AutoComplate(name:"Groovy").save(flash:true)
			new AutoComplate(name:"Grails").save(flash:true)
			new AutoComplate(name:"Haskell").save(flash:true)
			new AutoComplate(name:"Java").save(flash:true)
			new AutoComplate(name:"JavaScript").save(flash:true)
			new AutoComplate(name:"Lisp").save(flash:true)
			new AutoComplate(name:"Perl").save(flash:true)
			new AutoComplate(name:"PHP").save(flash:true)
			new AutoComplate(name:"Python").save(flash:true)
			new AutoComplate(name:"Primefaces").save(flash:true)
			new AutoComplate(name:"Ruby").save(flash:true)
			new AutoComplate(name:"Scala").save(flash:true)
			new AutoComplate(name:"Scheme").save(flash:true)
			new AutoComplate(name:"Struts").save(flash:true)
			new AutoComplate(name:"Spring").save(flash:true)
			new AutoComplate(name:"JSF").save(flash:true)
			new AutoComplate(name:"Hibernate").save(flash:true)
    }
    def destroy = {
    }
}
