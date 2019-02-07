# [Codecov][1] Kotlin Example
## Guide

**Using gradle?** See [gradle example](https://github.com/codecov/example-gradle)

### Travis Setup

Add to your `.travis.yml` file.
```yml
language: java
after_success:
  - bash <(curl -s https://codecov.io/bash)
```
### Produce Coverage Reports
#### Add Jacoco plugin
```xml
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.7.9</version>
  <executions>
    <execution>
      <goals>
        <goal>prepare-agent</goal>
      </goals>
    </execution>
    <execution>
      <id>report</id>
      <phase>test</phase>
      <goals>
        <goal>report</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```
## Caveats
### Private Repos
Add to your `.travis.yml` file.
```yml
after_success:
  - bash <(curl -s https://codecov.io/bash) -t uuid-repo-token
```

### Coverage Data Beyond the EOF

Kotlin coverage reports may include extra line data that exceeds the real length of the file. Codecov will fix this by extracting the file length from every `.kt` file and append it ot the report.


1. More documentation at https://docs.codecov.io
2. Configure codecov through the `codecov.yml`  https://docs.codecov.io/docs/codecov-yaml

We are happy to help if you have any questions. Please contact email our Support at [support@codecov.io](mailto:support@codecov.io)

[1]: https://codecov.io/
