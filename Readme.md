# Mutating tests

## Testing code 

`mvn clean test org.pitest:pitest-maven:mutationCoverage`

## Creating site
`mvn clean test org.pitest:pitest-maven:mutationCoverage site`

Note: `test` task must be run, otherwise `mutationCoverage` task will fail.