## (26) Testing in CICD Pipeline

### Points learned
1. CI (Continuous Integration): Integrating code to a shared repo and automatically build/test it [build -> unit tests -> integration tests]
   CD (Continuous Delivery / Deployment): release software to production by automatically pushing changes to staging system [review -> staging -> production]
	Delivery vs Deployment: deploy to production
		Delivery done manually, Deployment done automatically
2. Process:
	* Commit
	* Build
	* Test
	* Deploy 
3. Github Actions Components:
	* Workflow (configurable automated process that will run one or more jobs.)
	* Events (specific activity in repository that triggers a workflow run.)
	* Runners (server that runs your flow when theyre triggered.)
	* Jobs (set of steps in workflow that execute on the *same* runner.)
	* Action (custom app for GitHub Actions platform that prforms complec but often repeated task.)