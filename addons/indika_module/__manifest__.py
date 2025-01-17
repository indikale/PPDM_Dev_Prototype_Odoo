{
	'name': 'INDIKA Module',
    'summary' : "Privacy Policy Data Metrics",
	'description' : """Application Details""",
	'author' : "Leela Consultancy",
	'license' : "AGPL-3",
	'website' : "www.leelaconsultancy.co.uk",
	'category' : 'Uncategorized',
	'version' : '16.0.2.0.0',
    #any Dependency Module
	'depends' : ['base','website'],
	#always load
	'data' : [
		     'security/groups.xml',
			 'views/indikamodule_websitestable.xml',
			 'views/indikamodule_userstable.xml',
			 'views/indikamodule_cookiedatatable.xml',
			  'views/indikamodule_vendortable.xml',
			 'views/indikamodule_privacypolicytable.xml',
			 'views/indikamodule_cookietypetable.xml',
			 'views/indikamodule_cookiecategorytable.xml',
	         'security/ir.model.access.csv',
			 'views/templates.xml',
	         ],	
}
