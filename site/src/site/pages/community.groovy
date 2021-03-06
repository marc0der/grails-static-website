layout 'layouts/main.groovy', true,
        pageTitle: 'Grails Framework - Community',
        mainContent: contents {
            
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            include template: 'includes/community-navbar.groovy'
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-users') {}
                                yield ' Community'
                            }

                            article {

                                p {
                                    yield '''
                                        Grails would not be the successful Open Source project it is today,
                                        without the help of its users, forming the base of a wider Grails community
                                        and '''
                                    a(href: 'ecosystem.html', 'ecosystem')
                                    yield ' of projects using Groovy.'
                                }

                                p {
                                    yield "A great way to communicate with the community is to signup for Slack: "
                                }
                                div {

                                    yieldUnescaped '<script async defer src="https://slack-signup.grails.org/slackin.js?large"></script>'    
                                }
                                

                                p 'In this section of the website, you can find useful links and information about: '
                                ul {
                                    li "how you can ${$a(href: 'contribute.html', 'contribute')} to the project, its codebase, its documentation,"
                                    li "how to raise issues in our ${$a(href: 'contribute.html#reporting-issues', 'bug tracker')},"
                                    li "how to interact with other Grails users and developers through ${$a(href: 'http://slack-signup.grails.org', 'Slack')} or the ${$a(href: 'mailing-lists.html', 'mailing-lists')},"
                                    li "the upcoming ${$a(href: 'events.html', 'events and conferences')} you might want to attend to lear more about Groovy and to share your experience with others,"
                                    li "the list of ${$a(href: 'usergroups.html', 'user groups')} you can attend and where to meet other Groovy users."
                                }
                                p '''
                                    If you click on the socialize link in the menu, you will also find other ways to interact
                                    with the Grails community, and follow the news around the ecosystem:
                                '''
                                ul {
                                    li {
                                        a(href: 'http://www.groovy-lang.org/groovy-weekly.html', 'Groovy Weekly Newsletter')
                                        yieldUnescaped ' &mdash; links to articles, presentations, tweets, podcasts, every Tuesday'
                                    }
                                    li {
                                        a(href: 'https://google.com/+groovy', 'Google+ Groovy page')
                                        yieldUnescaped ' &mdash; for sharing news and articles'
                                    }
                                    li {
                                        a(href: 'http://bit.ly/g-community', 'Google+ Groovy community')
                                        yieldUnescaped ' &mdash; for discussing and exchanging with other Groovy users'
                                    }
                                }
                            }
                            hr(class: 'divider')
                        }
                    }
                }
            }
        }