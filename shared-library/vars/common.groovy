def compile() {
    if (env.codeType == "python" || env.codeType == "static") {
        return "Return, Do not need compilation"
    }
    stage ('Compile Code') {
        if (env.codeType == "maven") {
            sh '/home/centos/maven/bin/mvn package'
        }
        if (env.codeType =="nodejs") {
            print 'npm install'
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