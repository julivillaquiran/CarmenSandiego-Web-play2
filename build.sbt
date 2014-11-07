name := "carmenSandiego-Web-play2"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "unq.ui.carmensandiego" % "carmensandiego-model" % "0.0.1-SNAPSHOT"
)
 
resolvers +=(
	"Local Maven Repository" at "file://C:/Users/JulianV/.m2/repository"
)    

play.Project.playJavaSettings		
