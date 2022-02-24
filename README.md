APP

![Unit Coverage](.github/badges/jacoco-unit.svg)
![Unit Branches](.github/badges/branches-unit.svg)

TEST

![Component Coverage](.github/badges/jacoco-component.svg)
![Component Branches](.github/badges/branches-component.svg)

Aggregated

![Aggregated Coverage](.github/badges/jacoco-aggregated.svg)
![Aggregated Branches](.github/badges/branches-aggregated.svg)


# Test/JaCoco Report Aggregation

Testing Gradle 7.4 [Test](https://docs.gradle.org/7.4/release-notes.html#aggregation-tests) and [JaCoCo](https://docs.gradle.org/7.4/release-notes.html#aggregation-jacoco) report aggregation

[Gradle 7.4 Release Notes](https://docs.gradle.org/7.4/release-notes.html)

## Quickstart

Clone this repo:

```shell
git clone https://github.com/eduellery/report-aggregation.git
```

## Execute

Clean and build all modules:

```shell
./gradlew clean build
```

## Pipeline

Pipeline is building and running tests on `app` and `test` modules. Code coverage badges for each module are displayed.
