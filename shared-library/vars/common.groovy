def compile() {
    stage ('Compile Code') {
        if (env.codeType == "maven") {
            sh '/home/centos/maven/bin/mvn package'
        }
        if (env.codeType =="nodejs") {
            print 'NodeJs'
        }
        if (env.codeType == "python") {
            print 'python'
        }
        if (env.codeType == "static") {
            print 'static'
        }
    }

}
def test() {
    stage ('Test Cases') {
        print 'Test'
    }
}
def codequality() {
    stage ('Code Quality') {
        print 'code quality'
    }
}
def codesecurity() {
    stage ('Code Security') {
        print 'code security'
    }
}
def release() {
    stage ('Release') {
        print 'release'
    }
}