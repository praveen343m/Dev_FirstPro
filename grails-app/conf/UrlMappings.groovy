class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"
		{
            constraints 
			{
                // apply constraints here
            }
        }
         // "/"(controller:"test",action:'index')
        //"/"(controller:"abc",action:'firstpage')
		//"/"(controller:"second",action:'index3')
		//"/"(controller:"Actionsubmit",action:'displayForm')
		"/"(controller:"Set",action:'index')
		
		  
        "500"(view:'/error')
	}
}
